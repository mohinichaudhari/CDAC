
const Promise = require("bluebird");
const mysql = require("mysql");
Promise.promisifyAll(require("mysql/lib/Connection").prototype);
Promise.promisifyAll(require("mysql/lib/Pool").prototype);

const express = require("express");
const app = express();

app.get("/", async (req, res) => {
  try {
    const bookid = req.query.bookid;
    const bookname = req.query.bookname;
    const authorname = req.query.authorname;
    const bookrate = req.query.bookrate;
    const category = req.query.category;

    const connection = mysql.createConnection({
      user: "root",
      password: "mohini1998",
      host: "localhost",
      database: "abc",
    });

    await connection.connectAsync();

    let sql =
      "INSERT INTO BOOK(BOOKID, BOOKNAME, AUTHORNAME, BOOKRATE,CATEGORY) VALUES (?, ?, ?,?, ?)";
    await connection.queryAsync(sql, [bookid,bookname,authorname,bookrate,category]);

    await connection.endAsync();

    const json = { message: "Hurrrayyy, Record Added, Lets Celebrate!!" };
    res.json(json);
  } catch (err) {
    const json = { message: "Error Occured!!" };
    res.json(json);
  }
});
  
  app.listen(3001);