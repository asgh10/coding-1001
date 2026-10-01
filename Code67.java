
class A {

    A() {
        System.out.println("매서드 1 입니다");
    }
    
    A(int a, int b) {
        this(); // this()는 생성자에서만 실행된다 ( 실제 많이 사용된다 ) 
                // this()를 이용해 다른 생성자를 호출할 때는 해당 생성자의 가장 첫 번째 줄에 작성해야 한다 그렇지 않으면 컴파일 에러가 발생해버린다
        System.out.println("매서드 2 입니다");
    }
    
    
    A(int a, int b, int c) {
        System.out.println("매서드 3 입니다");
    }
}

    public class Code67 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(1, 2);
        A a3 = new A(1, 2, 3);    
    }
}



    
    /* 
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 적어주세요");
        String str1 = sc.nextLine();

        System.out.println("찾을 문자를 적어주세요");
        char ch = sc.nextLine().charAt(0);

        
        System.out.println("추가 할 문자를 입력 해주세요");
        String str2 = sc.nextLine();

        int index = str1.indexOf(ch);


        System.out.println("입력한 문자열은 " + str1 + "입니다");
        System.out.println(str1 + "에 " + str2 + "를 추가하면 " + str1 + str2 + "입니다");

        if(index != -1) {
            System.out.println("찾은 문자의 위치는 " + index + "입니다");
        } else {
            System.out.println("찾는 문자가 없습니다");
        }
        sc.close();
    }
    */




/*
오버로딩의 개념 
같은 이름의 메서드를 클래스 내에 여러 개 정의하는 것
매개변수의 개수, 타입 중 하나 이상이 달라야 성립한다

주의점 
리턴 타입만 다른 것은 오버로딩이 아니다 컴파일러가 메서드를 구분할 때 리턴 타입(예: int, void)은 보지 않고 오직 메서드 이름과 매개변수만 보기 때문에 에러가 난다
이름이 같다면 수행하는 역할도 비슷해야 한다 (예: print 메서드는 출력용으로만 사용)



this의 개념 
현재 실행 중인 객체 자신을 가리키는 참조변수 객체 내부에서 자기 자신의 멤버(변수나 메서드)를 명확히 가리킬 때 씁니다.

주요 쓰는법 & 주의점 

변수 이름 충돌 해결 (this.변수명)
    매개변수 이름과 멤버 변수 이름이 같을 때 멤버 변수 앞에 this.를 붙여 구분한다 (예: this.name = name;)

생성자 재사용 (this(...))
    생성자 안에서 다른 생성자를 호출할 때 사용합니다. 코드 중복을 줄여줍니다.

절대 잊지 말아야 할 주의점 (this() 호출 위치)
    this()를 이용해 다른 생성자를 호출할 때는, 반드시 생성자의 가장 첫 번째 줄에 작성해야 한다 ( 둘째 줄 이상에 적으면 컴파일 에러가 발생한다 )
    static 메서드 안에서는 this를 절대 사용할 수 없다 (static은 객체가 만들어지기 전부터 존재하므로 '현재 객체'를 뜻하는 this의 개념이 존재하지 않는다)
*/