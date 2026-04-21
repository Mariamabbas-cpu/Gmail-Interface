# 🎨 Java Swing Login Interface

A clean and interactive **Graphical User Interface (GUI)** built using Java Swing. This project demonstrates the fundamental use of visual components, layout management, and image processing in Java desktop applications.

---

## 🛠️ Components Implemented

In this project, I explored and implemented the following **Swing Components**:

| Component | Description |
| :--- | :--- |
| **`JFrame`** | The main window container with a custom title and icon. |
| **`JPanel`** | A mini-container used to organize elements with an **Absolute Layout**. |
| **`JTextField`** | Input field for usernames. |
| **`JPasswordField`** | Secure input field that masks characters for passwords. |
| **`JButton`** | Interactive login button. |
| **`JLabel`** | Used for static text (Username/Password labels) and displaying images. |
| **`JCheckBox`** | "Save Password" feature implementation. |
| **`JComboBox`** | Dropdown menu for selecting user roles (Admin, User, Register). |
| **`JList`** | Selection list for choosing languages (English/Arabic). |
| **`ImageIcon`** | Handling and scaling external images (e.g., Gmail icon). |

---

## 🚀 Key Features

### 📐 Layout Management
I used an **Absolute Layout** (`setLayout(null)`) to have full control over the exact positioning and size of each component using the `setBounds(x, y, width, height)` method.

### 🖼️ Image Processing
Implemented advanced image scaling to ensure the interface looks sharp:
* Used `getScaledInstance` with `Image.SCALE_SMOOTH` for high-quality icon resizing.
* Integrated the application icon into both the `JLabel` and the `JFrame` title bar.

### 🛡️ Security
Utilized `JPasswordField` to ensure sensitive data (passwords) is not visible during entry.

---

## 🖥️ How to Run
1. Ensure you have the **JDK** installed on your machine.
2. Clone this repository.
3. Make sure the image path `images/gmail.png` exists in your project directory.
4. Compile and run `MainGUI.java`:
   ```bash
   javac GUI/MainGUI.java
   java GUI.MainGUI
   ```
