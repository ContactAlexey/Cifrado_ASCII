  <h1>🔐 ASCII Encryptor/Decryptor</h1>

  <p>This Java console application allows you to:</p>
  <ul>
    <li>Encrypt a word by converting each character into its ASCII numeric value.</li>
    <li>Decrypt a sequence of ASCII numbers back into the original text.</li>
  </ul>

  <h2>📚 How It Works</h2>
  <p>The program uses a predefined dictionary mapping common characters to their ASCII codes, including:</p>
  <ul>
    <li>Uppercase and lowercase letters (A-Z, a-z)</li>
    <li>Numbers (0-9)</li>
    <li>Common punctuation and special characters</li>
    <li>Some extended ASCII characters (like accented letters)</li>
  </ul>

  <h2>⚙️ Features</h2>
  <ul>
    <li>Menu-driven interface with two options: Encrypt or Decrypt.</li>
    <li>Input validation for ASCII numbers during decryption.</li>
    <li>Random error code generation for invalid menu options.</li>
  </ul>

  <h2>🛠️ Requirements</h2>
  <ul>
    <li>Java Development Kit (JDK) 8 or higher</li>
    <li>Standard Java libraries (<code>java.util</code> package)</li>
  </ul>

  <h2>🚀 How to Run</h2>
  <ol>
    <li>Compile the Java file:</li>
  </ol>
  <pre><code>javac ASCII.java</code></pre>
  <ol start="2">
    <li>Run the compiled program:</li>
  </ol>
  <pre><code>java Libre.ASCII</code></pre>

  <h2>📝 Usage</h2>
  <p>After running, you will see a menu with options:</p>
  <ul>
    <li><strong>1. Encrypt a word:</strong> Enter any text to see its ASCII code sequence.</li>
    <li><strong>2. Decrypt ASCII numbers:</strong> Enter space-separated ASCII values to get back the original text.</li>
  </ul>

  <h2>📂 Project Structure</h2>
  <pre><code>Libre/
└── ASCII.java
</code></pre>

  <h2>⚠️ Notes</h2>
  <ul>
    <li>The program supports only characters included in the dictionary.</li>
    <li>Input validation exists only for ASCII number conversion during decryption.</li>
    <li>Invalid menu selections show an error message with a random error code.</li>
  </ul>

  <h2>👨‍💻 Author</h2>
  <p>Developed for educational purposes by <strong>Alexey Tenllado</strong>.</p>
