public class Day2GitGithub {
    /*
 1-) git init --> Local repo olusturmak icin yani  .git ile klasörümüzün
 içindeki dosyaları
 ilişkilendirmek için kullanılır
 2-) git add . --> Working space'den (yani yerel) dosyalarımı staging area'ya
 (yani commitlemek için beklenen yer) gönderir
 3-) git commiit -m "mesaj" --> Staging area'dan commit stora
 dosyalarımı göndermek için kullanılır
 (commit yani versiyon yani sürüm oluşturmuş olurum)
 4-) git push --> Uzak repo'ya(yani remote - GitHub)
  göndermek için kullandıgımız kod
 yalnız git push komutunu diirekt kullanmak istersek 1 kez
         git remote add origin adress
         git push -u origin master
NOT: Yukarıdaki iki komutu tek seferde kullandıktan sonra ikinci commit'lerim için sadece git push
kullanırız

  */
/*
YUKARDAKİNİN UYGULAMASI

PS C:\GitGithub> git add .
PS C:\GitGithub> git status
On branch master
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   src/Day2GitGithub.java

PS C:\GitGithub> git log --oneline
7477013 (HEAD -> master) yeni class
3a34df1 2.c
9e9513d 1.C
PS C:\GitGithub> git commit -m "V2"
[master a3dac63] V2
 1 file changed, 21 insertions(+)
 create mode 100644 src/Day2GitGithub.java
PS C:\GitGithub> git remote add origin https://github.com/caveken/Day2Github.git
PS C:\GitGithub> git push -u origin master

 */
    /*İlk defa PUSH yapacaksanız bir projeyi ;

1 - Önce GitHub a gidip New Repository i oluşturun
2- Oluşturduğunuz repository de size verilen https://github.com/.............git   adresini kopyalayın


Şimdi IntelliJ ye gelip TERMINAL ı açın;

3- git init yazın
4- git add . yazın
5- git commit -m"first commit"  (first commit yerine  ilke versiyon, ilk ders veya istediğiniz bir şeyi yazın)
6- git branch -M main
7- git remote add origin https://github.com/.............git (yukarıda2. satırda kopyalağınız adresi buraya yapıştırın)
8- git push -u origin main


SONRASINDA Aynı PROJE için ;

her yeni eklediğiniz şeyden sonra GitHub'a yüklemek için

9- git add .
10 - git commit -m"YENI NUMARA VEYA YAZI YAZ"
11 - git push


hepsi bu kadar

     */
    public static void main(String[] args) {
        System.out.println("github i ogrendim");
        
        //githubi ogrendim

        //cavidan branch degisiklik
        System.out.println("branch deneme1");
        System.out.println("master deneme1");
        System.out.println("2. branch deneme1");
        System.out.println("master deneme2");

    }
}
