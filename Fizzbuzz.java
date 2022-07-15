

public class leetCode {
    public List<String> fizzBuzz(int n){
        //Soru:
        //Sayı eğer 3'e ve 5'e aynı anda bölünüyorsa, fizzbuzz yazdıracağız.
        //Eğer saedece 3'e bölünüyorsa fizz, sadece 5'e bölünüyorsa buzz yazdırıyoruz.
        //Normalde kullanıcıdan input almak için gerekelnleri yazardım ala leetcode sadece bizden algoritmayı istiyor.
        //Cevaplarımızı saklamak için bir listeye ihtiyacımız var. Bir string list oluşturuyorum.
        List<String> answers = new ArrayList<>();
        for (int i = 0; i <= n; i++){
            //Eğer sayının 3'e ve 5'e bölümünden birşeykalmaz ise
            if(i % 3 == 0 && i % 5 == 0){
                answers.add("FizzBuzz");
            }else if(i % 3 == 0){
                //Eğere sadece 3'e bölümünden birşey kalmaz ise
                answers.add("Fizz");
            } else if (i % 5 == 0) {
                //Eğer 5'e bölümünden birşey kalmaz ise.
                answers.add("Buzz");
            }else{
                answers.add(Integer.toString(i));
            }
        }
        return answers;
    }

    //Arraylar hakkında not;
    //Eğer int [] a; şeklinde bir değişken tanımlarsan IntArray sınıfından bir referans tanımlamış oluyoruz.
    //int[] a; new int[10];
    //Böyle bir tanımlamada ise bellekte 10 elemanlık bir Intarray tanımlıyoruz ve referansı a'dır.
}
