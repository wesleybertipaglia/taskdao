# 📋 TaskDAO

A simple task manager built in Java using **JDBC** and **MySQL**.
This project was created as a learning tool to practice **SQL operations**, **JDBC connections**, and building a clean **console-based CRUD app** in Java, following the **MVC pattern**.

## 📖 Table of Contents

* [Features](#features)
* [Get Started](#get-started)
* [Usage Example](#usage-example)
* [Contributing](#contributing)
* [License](#license)

## ✨ Features

* Basic **CRUD operations** for task management
* Interactive **terminal menu**
* Clean and modular Java code following the **MVC structure**
* Uses **JDBC** for direct SQL execution
* MySQL database managed via **Docker Compose**
* Clear separation of **controllers**, **services**, **repositories**, and **entities**

## 🚀 Get Started

### Prerequisites

* Java 17+
* Maven
* Docker & Docker Compose

### Running the project

1. **Clone the repository**

   ```bash
   git clone https://github.com/wesleybertipaglia/taskdao.git
   ```

2. **Navigate to the project directory**

   ```bash
   cd taskdao
   ```

3. **Start the database with Docker Compose**

   ```bash
   docker-compose up -d
   ```

4. **Build the project**

   ```bash
   mvn clean install
   ```

5. **Run the app**

   ```bash
   mvn exec:java -Dexec.mainClass="com.wesleybertipaglia.Main"
   ```

## 📌 Usage Example

```plaintext
-------------------------------------
📝 TASKDAO MENU
-------------------------------------

1. List tasks
2. Create task
3. Update task
4. Delete task
0. Exit

Choose an option: 1

--- Tasks ---
📝 1 - Buy groceries [✅ Completed]
📝 2 - Finish homework [🔲 Pending]
```

## 🤝 Contributing

Contributions are welcome!
If you have any suggestions or improvements, feel free to open an issue or submit a pull request.

## 📄 License

This project is licensed under the **MIT License**. See the `LICENSE` file for more details.
