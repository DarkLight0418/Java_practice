package Chapter12_CollectionFW.No1_Generic;

public class GenericPrinter <T extends Material> {  // extend 예약어로 사용할 수 있는 자료형에 제한을 둠.
    private T material;  // T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();  // 상위 클래스 Material의 메서드 호출
    }
}
