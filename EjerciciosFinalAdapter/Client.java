package EjerciciosFinalAdapter;

public class Client {

    public static void main(String[] args) {
        Android TikTok = new Android();
        AppPCA Nextflix = new AppPCA(new Web());
        IOS MaxBmx = new IOS();
        WindowsPhone NvdiaCel = new WindowsPhone();


        TikTok.login();
        TikTok.logout();
        TikTok.reportes();

        Nextflix.login();
        Nextflix.logout();
        Nextflix.reportes();

        MaxBmx.login();
        MaxBmx.logout();
        MaxBmx.reportes();

        NvdiaCel.login();
        NvdiaCel.logout();
        NvdiaCel.reportes();


    }

}
