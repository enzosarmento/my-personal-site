# My Personal Website

This is my personal website, built with React, TypeScript, and Tailwind CSS. It features a retro Game Boy-inspired design.

## Technologies Used

*   **Frontend:** React, TypeScript
*   **Styling:** Tailwind CSS
*   **Build Tool:** Vite
*   **Routing:** React Router
*   **Deployment:** GitHub Pages

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

*   npm
    ```sh
    npm install npm@latest -g
    ```

### Installation

1.  Clone the repo
    ```sh
    git clone https://github.com/enzosarmento/enzosarmento.github.io.git
    ```
2.  Install NPM packages
    ```sh
    npm install
    ```

### Running the Application

To run the application in development mode, use the following command:

```sh
npm run dev
```

This will start the development server, usually at `http://localhost:5173/`.

## Available Scripts

In the project directory, you can run:

*   `npm run dev`: Runs the app in the development mode.
*   `npm run build`: Builds the app for production to the `dist` folder.
*   `npm run lint`: Lints the code using ESLint.
*   `npm run preview`: Serves the production build locally for preview.

## Deployment

This site is deployed to GitHub Pages. The `deploy` script handles the deployment process.

```sh
npm run deploy
```

This script will first build the project and then deploy the `dist` folder to the `gh-pages` branch of the repository.