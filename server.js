const express = require("express");
const cors=require("cors");

const app=express();


app.use(cors()); // unblocking cors policy
app.use(express.json()); 

const adddata=require("./add");

/*app.get("/adduser",async (req,res)  =>{
    try{
        const input =req.query;
        await adddata.adddata(input);
        res.json({message:"Success"})
    }catch(err){
        console.log(err)
    }
});
*/

app.post("/adduser", async (req, res) => {
    try {
      const input = req.body; // before doing this
  
      await adddata.adddata(input);
      res.json({ message: "success post" });
    } catch (err) {
      res.json({ message: "failure post" });
    }
  });
app.listen(3200);