#include<stdio.h>
#include<pthread.h>
#include<string.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdlib.h>
    
pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;

void * test(void * arg)
{
	pthread_mutex_lock(&mutex);
	int threadno =*(int*)arg;
	for (int i = 0; i < 5; i++) {
		printf("%drunning thread %d\n",threadno,i);
		//sleep(1);
	}
	return NULL;
}

int main()
{
    int temp;
	pthread_t tid,tid1;
	int ret ;
	int i1=1,i2=2;
	printf("test start\n");
    ret = pthread_create(&tid,NULL,test,&i1);
	pthread_create(&tid1,NULL,test,&i2);
    if(ret != 0){
        printf("error create thread:%s\n",strerror(ret));
        return 1;
    } else {
		printf("thread create success!\n");
	}

	sleep(1);
	pthread_join(tid,NULL);
	pthread_join(tid1,NULL);
	

    return 0;
}
