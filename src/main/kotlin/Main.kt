external fun require(module:String):dynamic

fun main(args: Array<String>) {
    println("Kotlin and Javascript <3")

    val express = require("express")
    val app = express()

    app.get("/", { req, res ->
        res.type("text/plain")
        res.send("May the force be with you!")
    })

    app.listen(3000, {
        println("Listening on port 3000")
    })
}