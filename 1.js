function AJAX() {
    let xhr = new XMLHttpRequest();
    xhr.onload = () => {
        const jsontext = JSON.parse(xhr.responseText);
        domLogic(jsontext);
    };
    xhr.open("GET", "https://reqres.in/api/users?page=2");
    xhr.send();
};

function domLogic(jsontext) {
    console.log(jsontext);
    let parent = document.getElementById("parent");

    for (let i = 0; i < jsontext.data.length; i++) {
        var item = jsontext.data[i];

        let newelement = parent.children[0].cloneNode(true);
        newelement.innerHTML = item.first_name + " " + item.last_name;

        parent.insertBefore(newelement, parent.firstChild);


    }
};