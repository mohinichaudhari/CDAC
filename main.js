let mysql = require("mysql");
let Promise = require("bluebird");

Promise.promisifyAll(require("mysql/lib/Connection").prototype);
Promise.promisifyAll(require("mysql/lib/Pool").prototype);

let conn = {
    host: "localhost",
    user: "root",
    password: "mohini1998",
    database: "abc"
}
let readallbook = async () => {
    const connection = mysql.createConnection(conn)

    await connection.connectAsync()

    let query1 = "SELECT * FROM book";

    let mohini =await connection.queryAsync(query1).then((data)=>{
        console.log(mohini)
    }).catch((err)=>(){
        console.log(err)
    })
    

    await connection.endAsync()
}
readallbook();

