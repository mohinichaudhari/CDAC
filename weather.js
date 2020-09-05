function search()
{
   let cityname = document.getElementById("inputbox").value || "pune";

   let url="https://api.openweathermap.org/data/2.5/weather?appid=7023923dd26a725da995c75b65864de5&units=metric&q=" + cityname;

    let xhr=new XMLHttpRequest();
    xhr.open("GET",url);
    xhr.onload = () =>{
        
        const jsontext=JSON.parse(xhr.responseText);

        domLogic(jsontext);
    } ;
    xhr.send();      
};

function domLogic(jsontext){
    const name=jsontext.name;
    const maxtemp =jsontext.main.temp_max;
    const cloud1=jsontext.weather[0].main;
    const wind1=jsontext.wind.speed;
    const visibility1=jsontext.visibility;
    const pressure1=jsontext.main.pressure;
    const humidity1=jsontext.main.humidity;
    const feels1=jsontext.main.feels_like;

    let cname=document.getElementById("cityname");
    cname.innerHTML=name ;
    
    let temp=document.getElementById("temp");
    temp.innerHTML=maxtemp + " &#x2103;" ;

    let cloud=document.getElementById("clouds");
    cloud.innerHTML=cloud1;

    let wind=document.getElementById("wind");
    wind.innerHTML="Wind : " + wind1 + " km/hr" ;
    
    let visibility=document.getElementById("visibility");
    visibility.innerHTML="visibility : " + visibility1/1000 + " km";

    let pressure=document.getElementById("pressure");
    pressure.innerHTML="pressure : "+ pressure1 + " mb"  ;

    let humidity=document.getElementById("humidity");
    humidity.innerHTML="Humidity : " + humidity1 + " %" ;
    
    let feels=document.getElementById("feels");
    feels.innerHTML="Feels Like : " + feels1 + " &#x2103;";
    
    document.getElementById("inputbox").value = "";
};