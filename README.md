# Bookstore App
Bookstore App is a mobile application that allows users to search for books using the Google Books API and save them to their personal library. The application also provides a feature that allows users to leave feedback to the developer through email using a form within the app.

## Features
The application provides the following features:

Book search: search for books using the Google Books API and display information about each book, including the title, author, and cover image.
Book details: display detailed information about each book, including the description, publication date, and ISBN.
Feedback form: allow users to leave feedback to the developer through email using a form within the app.

## Usage
To use the application, simply open the app and enter a search query in the search bar. The application will retrieve a list of books from the Google Books API that match the search query. To view more information about a book, click on the book cover image. To leave feedback to the developer, navigate to the "Feedback" section of the app and fill out the feedback form.

## Authentication
The Google Books API does not require authentication to use. However, it does limit the number of requests that can be made in a given time period. To avoid hitting the rate limit, the application caches the results of previous requests and reuses them if they are still valid.

## Contributing
Contributions to this project are welcome! If you have any bug reports, feature requests, or code improvements, please submit them as issues or pull requests on this repository.
