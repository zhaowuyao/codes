2012伦敦奥运会即将到来，大家都非常关注奖牌榜的情况，现在我们假设奖牌榜的排名规则如下：

1、首先gold medal数量多的排在前面；
2、其次silver medal数量多的排在前面；
3、然后bronze medal数量多的排在前面；
4、若以上三个条件仍无法区分名次，则以国家名称的字典序排定。
我们假设国家名称不超过20个字符、各种奖牌数不超过100，且大于等于0。

解答要求
时间限制：1000ms, 内存限制：64MB
输入
第一行输入一个整数N(0<N<21)，代表国家数量;
然后接下来的N行，每行包含一个字符串Namei表示每个国家的名称，和三个整数Gi、Si、Bi表示每个获得的gold medal、silver medal、bronze medal的数量，以空格隔开，如(China 51 20 21)，具体见样例输入。

输出
输出奖牌榜的依次顺序，只输出国家名称，各占一行，具体见样例输出。

样例
输入样例 1 复制

5
China 32 28 34
England 12 34 22
France 23 33 2
Japan 12 34 25
Rusia 23 43 0
输出样例 1

China
Rusia
France
Japan
England

code:

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Country> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Country country = new Country();
            country.setName(scanner.next());
            country.setGold(scanner.nextInt());
            country.setSilver(scanner.nextInt());
            country.setBronze(scanner.nextInt());
            list.add(country);
        }
        PriorityQueue<Country> priorityQueue = new PriorityQueue<>(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                if (o1.getGold() != o2.getGold()) {
                    // 按金牌排序
                    return o2.getGold() - o1.getGold();
                } else if (o1.getSilver() != o2.getSilver()) {
                    // 按银牌排序
                    return o2.getSilver() - o1.getSilver();
                } else if(o1.getBronze() != o2.getBronze()){
                    // 按铜牌排序
                    return o2.getBronze() - o1.getBronze();
                }else {
                    // 字典排序
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        for (Country country : list) {
            priorityQueue.add(country);
        }
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().getName());
        }
    }
}
class Country {
    public String name;
    public int gold;
    public int silver;
    public int bronze;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public int getSilver() {
        return silver;
    }
    public void setSilver(int silver) {
        this.silver = silver;
    }
    public int getBronze() {
        return bronze;
    }
    public void setBronze(int bronze) {
        this.bronze = bronze;
    }
}
