public class helloworld{
public static void main(String[] args){
    System.out.println("hello world!");
}
}
/*
test commit 这是修改之后的内容
git 可以追踪整个目录下的所有文件
U 即为未追踪的文件，M即为修改过的文件，D即为删除的文件
每次修改完之后，命令行需要执行 git add xxx 文件，
add之后的文件就进入了暂存区，也就是staged 
然后此时如果想确认提交了，那就输入 git commit -m “xxxx”
这个时候就会提交所有的暂存区文件，-m后面的参数就是这次提交的评论，每次都需要评论
然后这就是一次提交过程，
提交结束之后，可以上传到云端，git可以离线使用的，没有网，也能用，只不过所有的修改只会对本地起作用而已，当机器能联网时，就可以将先前没有同步的提交一并同步到云端
*/