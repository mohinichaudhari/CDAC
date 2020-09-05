let registerUserVer1 = async () => {

  const username =  document.getElementById("username").value;
  const password =  document.getElementById("password").value;
  const email =  document.getElementById("email").value;
  const mobile =  document.getElementById("mobile").value;


let url=`http://localhost:3200/adduser?username=${username}&password=${password}&email=${email}&mobile=${mobile}`;

await fetch(url);


 document.getElementById("username").value="";
 document.getElementById("password").value="";
 document.getElementById("email").value="";
 document.getElementById("mobile").value="";
}

let registerUsingPost = async () => {
  const username = document.querySelector("#username").value;
  const password = document.querySelector("#password").value;
  const email = document.querySelector("#email").value;
  const mobile = document.querySelector("#mobile").value;

  const input = {
    username,
    password,
    email,
    mobile,
  };
  const url = "http://localhost:3200/adduser";

  // http understands text
  await fetch(url, {
    method: "POST",
    body: JSON.stringify(input),
    headers: {
      "Content-Type": "application/json",
    },
  });

  document.querySelector("#username").value = "";
  document.querySelector("#password").value = "";
  document.querySelector("#email").value = "";
  document.querySelector("#mobile").value = "";
};
