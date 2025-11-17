# Reelo Campaign Automation

Simple automation framework for testing campaign creation on Reelo using Selenium and TestNG.

## What you need

- Java 11 or higher
- Maven
- Chrome browser

## Setup

1. Clone the repo and install dependencies:
```bash
mvn clean install
```

2. Update your credentials in `src/test/resources/data/signUpCred.json`:
```json
{
  "email": "your-email@test.com",
  "password": "yourpassword"
}
```

3. Update the image path in `src/test/resources/config.properties`:
```properties
imagePath = C:\\Users\\YourName\\Downloads\\your-image.jpg
```

## Running tests

```bash
mvn test
```

## What it does

The test logs in, creates an SMS campaign, adds an image, tests it, and saves.

## Structure

- `locators/` - where elements are located
- `pages/` - page object classes
- `tests/` - actual test cases
- `utils/` - helper methods for browser actions

## Issues?

- Make sure Chrome is updated
- Check your image path uses double backslashes on Windows
- Verify your login credentials are correct

That's it!
