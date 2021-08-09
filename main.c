#include<graphics.h>
#include<stdio.h>
int main(){
	int gd=DETECT,gm,color;
	initgraph(&gd,&gm,"C:\Program Files (x86)\Dev-Cpp\MinGW64\x86_64-w64-mingw32\include");
	putpixel(85,35,GREEN);
	getch();
	closegraph();
	return 0;
}
