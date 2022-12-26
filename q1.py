name = input("Enter your name: ")
age = input("Enter your age: ")
address = input("Enter your address: ")

if not name.isalpha() or not age.isdigit() or not address:
    print("Error: Invalid input")
else:
    print(f"Hello Mr/Ms {name} age {age} located in {address}.\nThanks for being one of our community, Enjoy.")
