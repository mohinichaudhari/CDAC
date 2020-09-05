let HTTP=require("http");
const mod1=require("./module1.js");
    //console.log(mod1.json.first);


HTTP.createServer((req,res)=>{
    
    res.write(JSON.stringify(mod1.json));
    res.write("HELLO");
     res.end();
}).listen(5006);





