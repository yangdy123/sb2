package com.ydy.mongodb;
//
////3.6.0
//
//import com.mongodb.*;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoCursor;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.result.DeleteResult;
//import com.mongodb.client.result.UpdateResult;
//import org.bson.Document;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static com.mongodb.client.model.Filters.*;
//
///**
// * mongoDB
// * MongoDB 增删改查 操作，包含批量操作
// *
// * @author
// * @create 2017-12-21 17:28
// **/
//public class TestMongoDB {
//    private static final String HOST = "127.0.0.1";
//    private static final int PORT = 27017;
//    private static final String DB_NAME = "admin";
//    private static MongoDatabase db;
//    private static DB db2;
//
//    static {
//        //   连接到 mongodb 服务
//        MongoClient mongoClient = new MongoClient(HOST, PORT);
//        //   连接到数据库
//        db = mongoClient.getDatabase(DB_NAME);
//    }
//
//
//    public static void MongoDBJDBC02() {
//        try {
//            //   连接到MongoDB服务 如果是远程连接可以替换“localhost”为服务器所在IP地址
//            // ServerAddress()两个参数分别为 服务器地址 和 端口
//            ServerAddress serverAddress = new ServerAddress("localhost", 27017);
//            List<ServerAddress> addrs = new ArrayList<ServerAddress>();
//            addrs.add(serverAddress);
//            //三个参数分别为 用户名 数据库名称 密码
//            MongoCredential credential = MongoCredential.createScramSha1Credential("username", "databaseName", "password".toCharArray());
//            List<MongoCredential> credentials = new ArrayList<MongoCredential>();
//            credentials.add(credential);
//            // 通过连接认证获取MongoDB连接
//            MongoClient mongoClient = new MongoClient(addrs, credentials);
//            //连接到数据库
//            MongoDatabase mongoDatabase = mongoClient.getDatabase("databaseName");
//            System.out.println("Connect to database successfully");
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//        }
//    }
//
//    //集合创建，插入文档
//    //我们可以使用 com.mongodb.client.MongoDatabase 类中的createCollection()来创建集合
//    public static void createCollection() {
//        try {
//            System.out.println("Connect to database successfully");
//            db.createCollection("user");
//            System.out.println("集合创建成功");
//            //   获取集合
//            //  我们可以使用com.mongodb.client.MongoDatabase类的 getCollection() 方法来获取一个集合
//            MongoCollection<Document> collection = db.getCollection("user");
//            System.out.println("集合 test 选择成功");
//
//            //插入文档
//            //1. 创建文档 org.bson.Document 参数为key-value的格式
//            //2. 创建文档集合List<Document>
//            //3. 将文档集合插入数据库集合中 mongoCollection.insertMany(List<Document>)
//            //插入单个文档可以用 mongoCollection.insertOne(Document)
//            Document document = new Document("title", "MongoDB").
//                    append("description", "database").
//                    append("likes", 300).
//                    append("by", "Fly");
//            List<Document> documents = new ArrayList<Document>();
//            documents.add(document);
//            collection.insertMany(documents);
//            System.out.println("文档插入成功");
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//        }
//    }
////> show collections
////    persons
////            user
////> db.user.find()
////    { "_id" : ObjectId("5a3b858e7be9783afccde496"), "title" : "MongoDB", "description" : "database", "likes" : 100, "by" : "Fly" }
//
//
//
//    //插入文档
//    //我们可以使用 com.mongodb.client.MongoDatabase 类中的createCollection()来创建集合
//    public static void insertCollection() {
//        try {
//            //   获取集合
//            //  我们可以使用com.mongodb.client.MongoDatabase类的 getCollection() 方法来获取一个集合
//            MongoCollection<Document> collection = db.getCollection("user");
//            System.out.println("集合 test 选择成功");
//
//            //插入文档
//            //1. 创建文档 org.bson.Document 参数为key-value的格式
//            //2. 创建文档集合List<Document>
//            //3. 将文档集合插入数据库集合中 mongoCollection.insertMany(List<Document>)
//            //插入单个文档可以用 mongoCollection.insertOne(Document)
//            Document document = new Document("title", "MongoDB").
//                    append("description", "database").
//                    append("likes", 300).
//                    append("by", "Fly");
//            List<Document> documents = new ArrayList<Document>();
//            documents.add(document);
//            collection.insertMany(documents);
//            System.out.println("文档插入成功");
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//        }
//    }
//
//    //更新单个文档,请使用updateOne
//    public static void updateOneDoc() {
//        MongoCollection<Document> collection = db.getCollection("user");
//        UpdateResult updateResult = collection.updateOne(eq("name", "alen"), new Document("$set", new Document("age", 110)));
//        System.out.println(updateResult.getModifiedCount());
//    }
//
//    /*更新全部文档
//    你可以使用 com.mongodb.client.MongoCollection 类中的 updateMany() 方法来更新集合中的文档。
//    */
//    public static void updateDoc() {
//        try {
//            MongoCollection<Document> collection = db.getCollection("user");
//            System.out.println("集合 test 选择成功");
//            //更新文档   将文档中likes=100的文档修改为likes=200
//            UpdateResult updateResult = collection.updateMany(eq("likes", 100), new Document("$set", new Document("likes", 200)));
//            System.out.println(updateResult.getModifiedCount());
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//        }
//    }
//
//    //删除第一个文档
//    // 要删除集合中的第一个文档，首先你需要使用com.mongodb.DBCollection类中的 findOne()方法来获取第一个文档，
//    //然后使用remove 方法删除。
//    public static void deleteDoc() {
//        try {
//            MongoCollection<Document> collection = db.getCollection("user");
//            System.out.println("集合 test 选择成功");
//            // 删除符合条件的第一个文档
//            DeleteResult deleteResultOne = collection.deleteOne(eq("likes", 200));
//            System.out.println(deleteResultOne.getDeletedCount());
//            //删除所有符合条件的文档
//            DeleteResult deleteResultMany = collection.deleteMany(eq("likes", 200));
//            // 检索查看结果
//            System.out.println(deleteResultMany.getDeletedCount());
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//        }
//    }
//
//    //查询集合  第一个文档
//    public static void queryFirstDoc() {
//        MongoCollection<Document> collection = db.getCollection("user");
//        //first() 返回第一个文档
//        Document myDoc = collection.find().first();
//        System.out.println(myDoc.toJson());
//    }
//
//    //查询集合  返回全部文档通过iterator()
//    public static void queryAllDoc() {
//        MongoCollection<Document> collection = db.getCollection("user");
//        //文档的总数
//        System.out.println(collection.count());
//        //iterator() 返回第一个文档
//        MongoCursor<Document> cursor = collection.find().iterator();
//        try {
//            while (cursor.hasNext()) {
//                System.out.println(cursor.next().toJson());
//            }
//        } finally {
//            cursor.close();
//        }
//    }
//
//    //虽然下面的迭代习惯是允许的，
//    //但是避免使用它，因为如果循环提前终止，
//    //应用程序可能会泄漏一个游标：
//    public static void queryAllDocByFor() {
//        MongoCollection<Document> collection = db.getCollection("user");
//        //文档的总数
//        System.out.println(collection.count());
//        //iterator() 返回第一个文档
//        for (Document cur : collection.find()) {
//            System.out.println(cur.toJson());
//        }
//    }
//
//    //查询指定文档
//    //要查询符合特定条件的文档，请将过滤器(eq过滤器)对象传递给find（）方法。 以
//    // 获取与过滤器匹配的单个文档
//    public static void queryEqDoc() {
//        MongoCollection<Document> collection = db.getCollection("user");
//        //查询 键为name  值为alen,返回第一个
//        Document myDoc = collection.find(eq("name", "alen")).first();
//        System.out.println(myDoc.toJson());
//    }
//
//
//    //该示例使用Find Iterable对象上的forEach方法将块应用于每个文档。
//    //要为范围指定过滤器，例如50 <i <= 100，可以使用和helper：
//    public static void queryConditionalDoc() {
//        MongoCollection<Document> collection = db.getCollection("user");
//        //该示例使用Find Iterable对象上的forEach方法将块应用于每个文档。
//        Block<Document> printBlock = new Block<Document>() {
//            @Override
//            public void apply(final Document document) {
//                System.out.println(document.toJson());
//            }
//        };
//        //查询 键为name  值为alen,返回第一个
//        collection.find(and(gt("age", 20), lte("age", 40))).forEach(printBlock);
//    }
//
//    //创建索引
//    // 要在一个或多个字段上创建索引，请将索引规范文档传递给createIndex（）方法。
//    // 索引键规范文档包含索引字段和每个字段的索引类型：
//    // new Document(<field1>, <type1>).append(<field2>, <type2>) ...
//    //对于升序索引类型，为<type>指定1。
//    //对于降序索引类型，为<type>指定-1。
//    public static void createIndexes() {
//        MongoCollection<Document> collection = db.getCollection("user");
//        String res = collection.createIndex(new Document("age", 1));
//        System.out.println("索引名：" + res);
//    }
//
//    public static void main(String[] args) {
////        deleteDoc();
//        //queryCollection();
//        // queryAllDocByFor();
//        //queryConditionalDoc();
//        createIndexes();
//    }
//}
//--------------------- 
//作者：u014401141 
//来源：CSDN 
//原文：https://blog.csdn.net/u014401141/article/details/78871272 
//版权声明：本文为博主原创文章，转载请附上博文链接！