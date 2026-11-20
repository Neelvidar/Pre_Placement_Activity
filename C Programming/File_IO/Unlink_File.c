#include <fcntl.h>
#include <stdio.h>
#include <unistd.h>

int main()
{
    int ret = 0;

    ret = unlink("Demo.txt");

    if (ret == -1)
    {
        printf("Unable to delete the file\n");
        return -1;
    }
    else
    {
        printf("File gets successfully deleted\n");
    }

    return 0;
}