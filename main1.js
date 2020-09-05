let mysql = require("mysql");
let Promise = require("bluebird");

Promise.promisifyAll(require("mysql/lib/Connection").prototype);
Promise.promisifyAll(require("mysql/lib/Pool").prototype);

let conn={
    host: "localhost",
    user: "root",
    password: "mohini1998",
    database: "abc"
}
let readdata = async () => {
      const connection= mysql.createConnection(conn)

      await connection.connectAsync()

      let query1="select ?? from book where bookid=?"

      let mohini=await connection.queryAsync(query1,["bookname","1"])
        console.log(mohini)
       await connection.endAsync()
}
readdata()