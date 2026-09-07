
#include <stdlib.h>
#include <string.h>

char *longestPalindrome(char *s) {
    int n = (int)strlen(s);
    int bestStart = 0;
    int bestLength = 1;

    for (int center = 0; center < n; center++) {
        int left = center;
        int right = center;

        while (left >= 0 && right < n && s[left] == s[right]) {
            if (right - left + 1 > bestLength) {
                bestStart = left;
                bestLength = right - left + 1;
            }
            left--;
            right++;
        }

        left = center;
        right = center + 1;

        while (left >= 0 && right < n && s[left] == s[right]) {
            if (right - left + 1 > bestLength) {
                bestStart = left;
                bestLength = right - left + 1;
            }
            left--;
            right++;
        }
    }

    char *result = (char *)malloc((bestLength + 1) * sizeof(char));
    if (result == NULL) {
        return NULL;
    }

    memcpy(result, s + bestStart, bestLength);
    result[bestLength] = '\0';

    return result;
}