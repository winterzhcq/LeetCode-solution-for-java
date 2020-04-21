
import java.util.*;

public class Solution {

    public List<List<String>> displayTable(List<List<String>> orders) {
        // 菜单foodSet
        TreeSet<String> foodSet = new TreeSet<>();

        // 订单集合 <餐桌号，<食品名称，食品数量>>
        TreeMap<String, TreeMap<String, Integer>> orderMap = new TreeMap<>(Comparator.comparingInt(Integer::parseInt));

        //1 遍历订单，填入相关信息
        for (List orderList : orders) {
            //1.1 获得餐桌号
            String tableNumber = (String) orderList.get(1);
            //1.2 获得食品名称
            String foodName = (String) orderList.get(2);
            //1.3 食品set里面加入食品名称
            foodSet.add(foodName);

            //1.4.1 如果不存在xx桌的订单，就创建一条订单map
            if (!orderMap.containsKey(tableNumber)) {
                // xx食品map
                TreeMap<String, Integer> food = new TreeMap<>();
                food.put(foodName, 1);
                // 将xx桌订单添加到所有订单map中
                orderMap.put(tableNumber, food);
            } else {
                // 1.4.2 如果xx桌子订单存在
                TreeMap<String, Integer> foodMap = orderMap.get(tableNumber);
                // 如果xx桌子订单中不存在xx事物，就加入
                if (!foodMap.containsKey(foodName)) {
                    // 将食物map添加到已存在的桌子订单中
                    foodMap.put(foodName, 1);
                } else {
                    // 如果已经存在xx事物，就将数量加1
                    foodMap.put(foodName, foodMap.get(foodName) + 1);
                }
            }
        }
        //2、将订单map写到结果集中
        List<List<String>> result = new ArrayList<>();
        // 2.1 添加第一行标题、
        ArrayList<String> title = new ArrayList<>();
        title.add("Table");
        for (String s : foodSet) {
            title.add(s);
        }
        result.add(title);

        //2.2 遍历订单map，将信息写到结果结合
        Set<String> tables = orderMap.keySet();

        for (String tableN : tables) {
            // 根据桌号获取 食品清单
            Map foods = orderMap.get(tableN);
            // 创建一条xx桌订单list
            ArrayList<String> list = new ArrayList<>();
            // 加入桌号
            list.add(tableN);
            // 遍历foodSet，根据foodSet中的食物名称来查foods，存在就返回数量。不存在就返回0
            for (String name : foodSet) {
                // 如果存在xx事物
                if (foods.containsKey(name)) {
                    String foodNum = String.valueOf(foods.get(name));
                    list.add(foodNum);
                } else {
                    // 如果没有预定xx事务，就将订单上写0
                    list.add("0");
                }
            }
            result.add(list);
        }

        return result;
    }
}
