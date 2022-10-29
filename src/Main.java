public class Main {
    static ListElement listHead = null;

    public static void main(String[] args) {
        append('基');
        append('本');
        append('情');
        append('報');
        append('技');
        append('術');
        append('者');

        System.out.println(listHead);
    }

    private static void append(char qVal){
        ListElement prev, curr;

        curr = new ListElement(qVal);

        if(listHead == null) {
            listHead = curr;
        }else{
            prev = listHead;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = curr;
        }
    }
}