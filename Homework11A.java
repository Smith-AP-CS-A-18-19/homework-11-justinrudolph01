import java.util.ArrayList;

public class Homework11A extends Homework11{

private ArrayList<Integer> list2;

  public Homework11A(){
    list2 = new ArrayList<Integer>();
  }

  public int problem4(){
    int sum = 0;
    list2 = getList();
    for (int i : list2){
      sum += i;
    }
    return sum;
  }

  @Override
  public void problem2(int n){
    int i = 0;
    while (i < list2.size()) {
      int num = list2.get(i);
        if ((n % num) != 0) {
          list2.remove(i);
        } else {
          i += 1;
      }
    }
  }
}
