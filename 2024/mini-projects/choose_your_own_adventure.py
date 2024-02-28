name = input("Type your name: ")
print("Welcome", name, "to this adventure!")

answer = input(
    "You are on a dirt road, it has come to an end and you can go left or right. Which way would you like to go? "
    )

if answer == "left":
    answer = input("You have come to a river, you can walk around it or swim across? Type walk or swim: ")

    if answer == "swim":
        print("You swam across and were eaten by an alligator :(")
    elif answer == "walk":
        print("You walked for many miles, ran out of water and lost the game.")
    else:
        print("Not a valid option. You lose.")

elif answer == "right":
    answer = input("You have come to a bridge. It looks wobbly, do you want to cross or head back (cross/back)? ")

    if answer == "back":
        print("You went back and lost :(")
    elif answer == "cross":
        answer = input("You have crossed the bridge and met a stranger. Do you talk to them (yes/no)? ")
    
        if answer == "yes":
            print("You talked to the stranger and they have given you gold. YOU WIN!")
        elif answer == "no":
            print("You ignored the stranger and they got offended. You lose :(")
        else:
            print("Not a valid option. You lose.")

    else:
        print("Not a valid option. You lose.")

else:
    print("Not a valid option. You lose.")

print("Thanks for playing", name)