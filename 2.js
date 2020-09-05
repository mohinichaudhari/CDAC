function json(){
    let xhr=new XMLHttpRequest();

    xhr.onload = () =>{
        const jsontext=JSON.parse(xhr.responseText);
        domLogic(jsontext);
    };

    xhr.open("GET", "https://reqres.in/api/users?page=2");
    xhr.send();
};

function domLogic(jsontext)
{
    console.log(jsontext);
   let parent = document.getElementById("parent")

   for( let i = 0; i<jsontext.data.length ; i++ )
   {
       var item = jsontext.data[i];

       let newelement=parent.children[0].cloneNode(true);
       newelement.innerHTML = item.first_name + " " + item.last_name;

       parent.insertBefore(newelement,parent.firstChild);
   }
};

function xml()
{
    let xhr=new XMLHttpRequest();
    xhr.open("GET","https://fakerestapi.azurewebsites.net/api/Authors");
    xhr.setRequestHeader("accept", "application/xml");

    xhr.onload = ()=>{
        const xmltext=xhr.responseXML;
        xmlDomHandler(xmltext);
    };
    
    xhr.send();
};

function xmlDomHandler(xmltext)
{
        const parentElement =  xmltext.querySelector("ArrayOfAuthor");
        console.log(parentElement);

        
    for (let i = 0; i < parentElement.children.length; i++) {
        let authorItem = parentElement.children[i];
    
        let firstName = authorItem.children[0].innerHTML;
        let lastName = authorItem.children[3].innerHTML;

        let parent = document.querySelector("#parent");
        let newElement = parent.children[0].cloneNode(true);
    
        newElement.innerHTML = firstName + " " + lastName;
    
        parent.insertBefore(newElement, parent.firstChild);
    }
};