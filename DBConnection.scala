// companion object example

object DBConnection {
    private val DB_URL = "http://localhost:5432/postgres"
    private val DB_UNAME = "shravanv"
    private val DB_PWD  = "123456"

    def apply() = new DBConnection()
}

class DBConnection {
    
    private val props = Map(
        "url" -> DBConnection.DB_URL,
        "uname" -> DBConnection.DB_UNAME,
        "pwd" -> DBConnection.DB_PWD
    )

    println("created new connection:"+ props("url"))
}

val connection = DBConnection()

