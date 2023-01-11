class Library:
    def __init__(self):
        self.clients = []
        self.librarians = []
        self.books = []
        self.borrowed_orders = []

    def add_client(self, client):
        self.clients.append(client)

    def add_librarian(self, librarian):
        self.librarians.append(librarian)

    def add_book(self, book):
        self.books.append(book)

    def add_borrowing_order(self, borrowing_order):
        self.borrowed_orders.append(borrowing_order)

    def show_books(self):
        for book in self.books:
            print(book.title)

    def borrow_book(self, librarian, client_id_no):
        print("Which book do you want to borrow?")
        self.show_books()
        book_title = input()
        selected_book = None
        for book in self.books:
            if book.title == book_title:
                selected_book = book
                break
        if selected_book and selected_book.status == "Available":
            client_exists = False
            selected_client = None
            for client in self.clients:
                if client.id_no == client_id_no:
                    client_exists = True
                    selected_client = client
                    break
            if client_exists:
                selected_book.status = "Unavailable"
                borrowing_order = BorrowingOrder(len(self.borrowed_orders) + 1, date.today(), selected_client.id,
                                                 selected_book.id, "Active")
                self.add_borrowing_order(borrowing_order)
                print("Borrowing order created successfully. Order ID: {}".format(borrowing_order.id))
            else:
                print("Client does not exist in the system.")
        else:
            print("Book is not available for borrowing.")

    def search_order(self, order_id):
        for borrowing_order in self.borrowed_orders:
            if borrowing_order.id == order_id:
                return borrowing_order
        return None

    def show_all_orders(self):
        for borrowing_order in self.borrowed_orders:
            print("Order ID: {}  Date: {}  Client ID: {}  Book ID: {}  Status: {}".format(
                borrowing_order.id, borrowing_order.date, borrowing_order.client_id,
                borrowing_order.book_id, borrowing_order.status))


lib = Library()

print("Are you a client or a librarian? (Enter 'client' or 'librarian')")
user_type = input()

if user_type == "client":
    print("Enter client's full name:")
    full_name = input()
    print("Enter client's age:")
    age = int(input())
    print("Enter client's ID number:")
    id_no = input()
    print("Enter client's phone number:")
    phone_number = input()
    client = Client()
