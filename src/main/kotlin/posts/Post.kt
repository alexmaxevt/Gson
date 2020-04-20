package posts

class Post (
    id: Long,
    author: String,
    content: String,
    dateStamp: Long,
    likedByMe: Boolean,
    likedCount: Int,
    sharedByMe: Boolean,
    sharedCount: Int,
    commentsByMe: Boolean,
    commentsCount: Int,
    postType: PostType
) {
    var id: Long = 0
    var author: String = ""
    var content: String = ""
    var dateStamp: Long = 0
    var likedByMe: Boolean = false
    var likedCount: Int = 0
    var sharedByMe: Boolean = false
    var sharedCount: Int = 0
    var commentsByMe: Boolean = false
    var commentsCount: Int = 0
    var address: String = ""
    var lat: Double = 0.0
    var lng: Double = 0.0
    var postType: PostType = PostType.POST
    var videoLink: String = ""
    var imageLink: String = ""
    var intentLink: String = ""

    init {
        this.id = id
        this.author = author
        this.content = content
        this.dateStamp = dateStamp
        this.likedByMe = likedByMe
        this.likedCount = likedCount
        this.sharedByMe = sharedByMe
        this.sharedCount = sharedCount
        this.commentsByMe = commentsByMe
        this.commentsCount = commentsCount
        this.postType = postType
    }
    constructor(
        address: String,
        lat: Double,
        lng: Double,
        id: Long,
        author: String,
        content: String,
        dateStamp: Long,
        likedByMe: Boolean,
        likedCount: Int,
        sharedByMe: Boolean,
        sharedCount: Int,
        commentsByMe: Boolean,
        commentsCount: Int,
        postType: PostType
    ) : this(id, author, content, dateStamp, likedByMe, likedCount, sharedByMe, sharedCount, commentsByMe, commentsCount, postType) {
        this.address = address
        this.lat = lat
        this.lng = lng
    }
    constructor(
        videoLink: String,
        id: Long,
        author: String,
        content: String,
        dateStamp: Long,
        likedByMe: Boolean,
        likedCount: Int,
        sharedByMe: Boolean,
        sharedCount: Int,
        commentsByMe: Boolean,
        commentsCount: Int,
        postType: PostType
    ) : this(id, author, content, dateStamp, likedByMe, likedCount, sharedByMe, sharedCount, commentsByMe, commentsCount, postType) {
        this.videoLink = videoLink
    }
    constructor(
        imageLink: String,
        intentLink: String,
        id: Long,
        author: String,
        content: String,
        dateStamp: Long,
        likedByMe: Boolean,
        likedCount: Int,
        sharedByMe: Boolean,
        sharedCount: Int,
        commentsByMe: Boolean,
        commentsCount: Int,
        postType: PostType
    ) : this(id, author, content, dateStamp, likedByMe, likedCount, sharedByMe, sharedCount, commentsByMe, commentsCount, postType) {
        this.imageLink = imageLink
        this.intentLink = intentLink
    }
}