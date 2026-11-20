#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>

// 1. stdin at 0 index
// 2. stdout at 1 index
// 3. stderr at 2 index

int main()
{
    int fd = 0;

    fd = creat("Demo.txt", 0777);

    if (fd == -1)
    {
        printf("Unable to create the file\n");

        return -1;
    }
    else
    {
        printf("file gets created with fd : %d\n", fd);
    }

    return 0;
}