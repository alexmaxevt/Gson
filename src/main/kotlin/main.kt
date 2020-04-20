import com.google.gson.GsonBuilder
import posts.Post
import posts.PostType
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val posts = listOf(
        Post(1, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.POST),
        Post("address", 55.75222, 37.61556, 2, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.EVENT),
        Post("https://vimeo.com/27299211", 3, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.VIDEO),
        Post("https://netology.ru/backend/tilda/images/tild6631-3066-4237-b831-316130393663__logo-full-color-blac.svg", "https://netology.ru/?utm_source=yandex&utm_medium=cpc&utm_campaign=brand_all_ou_ya_retarget&utm_content=8944030781&utm_term=нетология&yclid=1932640884155777924&stop=1", 1, "Netology", "First post in our network!", 1585637381, false, 0, false, 50, false, 10, postType = PostType.ADVERTISING)
    )
    val gson = GsonBuilder().apply {
        setPrettyPrinting()
        serializeNulls()
    }.create()
    Files.write(Paths.get("./postlist.json"), gson.toJson(posts).toByteArray(), StandardOpenOption.CREATE)
}