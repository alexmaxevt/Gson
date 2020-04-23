import com.google.gson.GsonBuilder
import posts.Post
import posts.PostType
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val posts = listOf(
        Post(1, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.POST),
        Post(2, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, "address", 55.75222, 37.61556, postType = PostType.EVENT),
        Post(3, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, null, null, null, postType = PostType.VIDEO, videoLink = "https://vimeo.com/27299211"),
        Post(4, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, null, null, null, postType = PostType.ADVERTISING, videoLink = null, intentLink = "https://netology.ru/?utm_source=yandex&utm_medium=cpc&utm_campaign=brand_all_ou_ya_retarget&utm_content=8944030781&utm_term=нетология&yclid=1932640884155777924&stop=1")
    )
    val gson = GsonBuilder().apply {
        setPrettyPrinting()
        serializeNulls()
    }.create()
    Files.write(Paths.get("./postlist.json"), gson.toJson(posts).toByteArray(), StandardOpenOption.CREATE)
}