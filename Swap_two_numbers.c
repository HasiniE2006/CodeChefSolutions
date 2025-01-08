#include <stdio.h>
int main() {
    int a = 5, b = 10;
    int temp;
    temp=a;
    a=b;
    b=temp;
    printf("%d %d",a,b);
    return 0;
}
