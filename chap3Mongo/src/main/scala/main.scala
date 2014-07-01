object main {
  def main(args: Array[String]): Unit = {
    import com.scalainaction.mongo._

    def client = new MyMongoClient
    def db = client.createDB("mydb")

    for(name <- db.collectionNames) println(name)
  }
}