#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>

// stdin at 0 index
// stdout at 1 index
// stderr at 2 index
// UFDT - User file descripter Table

int main()
{
    int fd = 0;
    char Arr[] = "Marvellous Infosystems";

    fd = open("Hello.txt", O_RDWR);

    if (fd == -1)
    {
        printf("Unable to open the file\n");

        return -1;
    }
    else
    {
        printf("file gets opened with fd : %d\n", fd);
        write(fd, Arr, 10);

        close(fd);
    }

    return 0;
}