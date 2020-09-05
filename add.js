const mysql=require("mysql");
const Promise=require("bluebird");

Promise.promisifyAll(require("mysql/lib/Connection").prototype);
Promise.promisifyAll(require("mysql/lib/Pool").prototype);

const db_config= require("./db.config");

const adddata = async (input) =>{
   const connection = mysql.createConnection(db_config.db_config)

   await connection.connectAsync();

   let sql = "INSERT INTO RECORD VALUES(?,?,?,?)";

   await connection.queryAsync(sql ,[input.username,input.password,input.email,input.mobile]);

    await connection.endAsync();
}
module.exports={
    adddata
} 