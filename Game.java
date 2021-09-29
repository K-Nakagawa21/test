import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.Random;

//上記はライブラリをimportするためのソースコードだよ♪  (グローバルにあたる部分)

class Game{
    public static void main(String[] args){

        int count = 0;
        for (int i =3; i>0; --i){
            int answer = 0;
            String message = "";
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

 //上記は冒頭で宣言をまとめたソースコードだよ♪

            System.out.println("残り問題数　あと"+i+"問");
            System.out.println("アジアの首都はどれか１つ選んでください。");
            System.out.println("1 : ニューヨーク");
            System.out.println("2 : ワシントン");
            System.out.println("3 : ロサンゼルス");
            System.out.println("4 : 東京");
            System.out.println("5 ; 北京");
            System.out.println("答えを番号で入力し、改行を押してください。=>");

//上記は標準出力をまとめたソースコードだよ♪

            
            try {
                String buf=bufferedReader.readLine();
                answer = Integer.parseInt(buf);
            
            }catch(Exception exception){
                answer = -1;
                message = "答えを1～5の番号で入力してください。"; 
            }

            if (4<= answer){
                message = "正解です。";
                count++;
            }

            else if (0<answer){
                message = "間違いです。";
            }

            System.out.println(message);
    
        }
    
        System.out.println("3問中"+count+"問正解");

    }

    }