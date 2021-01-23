// 【基本構文】

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}



// 【条件分岐】--------------------------------------------

// if
int age = 25;
if (age > 30) {
    System.out.println("30歳以上です");
} else if (number < 20) {
    System.out.println("20歳以下です");
} else {
    System.out.println("年齢は20代です");
}


// switch
switch (rank) {
    case 1:
        System.out.println("金メダル！");
        break;
    case 2:
        System.out.println("銀メダル！");
        break;
    case 3:
        System .out.println("銅メダル！");
        break;
    default:
        System.out.println("メダルを獲得できませんでした");
        break;
}



// 【繰り返し文】------------------------------------------

// while
int i = 1;
while (i <= 10) {
    System.out.println(i + "回目です");
    i ++;
}


// for
for (int i = 1; i <= 10; i ++) {
    if (i > 5) {
        break; // 6回目で強制終了
    }
    System.out.println(i + "回目です");
}

for (int i = 1; i <= 10; i ++) {
    if (i % 3 == 0) {
        continue; // 3の倍数の時、その処理を飛ばして次のループへ移る
    }
    System.out.println(i + "回目です");
}



// 【配列】----------------------------------------------

String[] names = {"Mike", "John", "Bob"};
System.out.println(names[1]);

// 繰り返し文との組み合わせ
for (int i = 0; i < names.length; i ++) { // 変数.lengthにより、配列内の数が多くなっても数える必要がない
    System.out.println("こんにちは" + names[i]);
}

// 配列用の拡張for文
String[] names = {"田中", "坂本", "前田"};
for (String name: names) { // 変数 name に配列 names を代入する
    System.out.println("私の名前は" + name + "です");
} // この場合でいうと、3人分の自己紹介が出力される

// 練習問題
// for文を用いて、配列numbersの奇数の和と偶数の和を求める
int[] numbers = {1, 4, 6, 9, 13, 16};
    
int oddSum = 0; // 奇数の合計
int evenSum = 0; // 偶数の合計
    
for (int number: numbers) {
    if (number % 2 == 0) {
        evenSum += number;
    } else {
        oddSum += number;
    }
}
System.out.println("奇数の和は" + oddSum + "です");
System.out.println("偶数の和は" + evenSum + "です");