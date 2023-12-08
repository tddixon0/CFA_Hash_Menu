#include <QtWidgets/QApplication>
#include <QtWidgets/QWidget>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QLabel>
#include <QtWidgets/QVBoxLayout>

//test
int main(int argc, char *argv[]) {
    QApplication gui(argc, argv);

    // Create a main window
    QWidget mainWindow;
    mainWindow.setWindowTitle("Simple GUI Example");

    // Create a layout for the main window
    QVBoxLayout layout(&mainWindow);

    // Create a label
    QLabel label("Hello, GUI World!", &mainWindow);
    label.setAlignment(Qt::AlignCenter);

    // Create a button
    QPushButton button("Click Me", &mainWindow);

    // Connect a slot (function) to the button's click signal
    QObject::connect(&button, &QPushButton::clicked, [&label]() {
        label.setText("Button Clicked!");
    });

    // Add the label and button to the layout
    layout.addWidget(&label);
    layout.addWidget(&button);

    // Show the main window
    mainWindow.show();

    // Start the application event loop
    return gui.exec();
}
