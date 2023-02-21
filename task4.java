// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
// могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
// восстановить выражение до верного равенства. Предложить хотя бы
// одно решение или сообщить, что его нет.


public class task4 {
    public static void main(String[] args) {

        String[] str = new String[] { "2?", "+", "?5", "=", "69" };
        String symbol = "?";
        int w = 0;
        int q = 0;
        for (String elem : str) {

            if (elem.endsWith(symbol)) {
                String qStr = elem.replace(symbol, "0");
                q = Integer.parseInt(qStr);
            }

          
            if (elem.startsWith(symbol)) {
                String wStr = elem.replace(symbol, "");
                w = Integer.parseInt(wStr);
            }
            
           
        }
 
        String eStr = str[str.length - 1];
        int e = Integer.parseInt(eStr);

        int res = e -q -w;
        if (res < 0) {
            System.out.println("No solutions");
        } else {
            int w_res = res / 10;
            String n = Integer.toString(w_res) + Integer.toString(w);
            w = Integer.parseInt(n);
            
            int q_res = res % 10;
            n = Integer.toString(q);
            n = n.replace("0", "");
            n = n + Integer.toString(q_res);
            q = Integer.parseInt(n);
            System.out.printf("%d + %d = %d", q, w, e);
        }
    }
}


