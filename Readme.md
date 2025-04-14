## L09 - HashCode

For this lab, implement Java's hashCode for Strings.

You will need to know how to create hashCodes for your final.

First, implement the official Java version of String's hashCode:

s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

### Questions for reflection:
Why multiply by 31? What's special about that number?

What does raising the character by the power do?

If you modulate (%) by 7 or 15, how many more collisions occur? 

What is the Big O cost of the official hashCode method?

Consider the time and space costs of hashing vs indexed arrays?

If hashCodes are created once and then cached, how does this change your analysis?

### Final thoughts:

    With enough array

        You can find anything O(1)

            Avoid resizing