#include <stdio.h>
 
int main() {
 
    int n;
    scanf("%d", &n);
    int index = 1;
    int i = 1;
    int j = 100;
    int count = 0;
    while(1) {
        for (int l = i; l <= j; l++)
        {
            
            if(l == n){
                printf("%d\n", index);
                count++;
                break;
            }
        }
        if (count == 1)
        {
            break;
        }
        
        i+=100;
        j+=100;
        index++;
    }
 
    return 0;
}