/** 
 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * ˼·����Ϊ����������������ϲ�����͹鲢�����˼·����ѡ��һ��ָ��Aָ��һ������ͷ����һ��ָ��B����һ���������ƶ���
 * ��Bָ��ڵ����Aʱ��Bֹͣ���Ұ�B�ڵ����һ���ڵ�.nextָ��A��Ȼ��A��ʼ�ƶ�
 * ��Aָ��ڵ����Bʱ��Aֹͣ���Ұ�A�ڵ����һ���ڵ�.nextָ��B Ȼ��B��ʼ�ƶ���ֱ��ĳһ�����������ɣ�����һ������ʣ�µĿ�����ȥ��
 * 
 * ���ԣ���Ϊ������������ͬ�����߼������Կ��Կ���ʹ�õݹ�ķ�������Ϊÿһ��merge�������� ���صĶ�����������ͷ��С��ֵ
 * */
public class Sixteen {
	
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	
	public ListNode Merge(ListNode list1,ListNode list2) {
       if(list1 ==null){
    	   return list2;
       }else {
    	   if(list2 ==null) {
    		   return list1;
    	   }else{
	    	   //��ÿһ�κϲ��������С��ͷָ��ϲ���һ�������ͷ��
	    	   if(list1.val <= list2.val){
	    		   list1.next = Merge(list1.next, list2);
	    		   return list1;
	    	   }else {
	    		   list2.next = Merge(list1, list2.next);
	    		   return list2;
	    	   }
    	   }
       }
	}	
}
