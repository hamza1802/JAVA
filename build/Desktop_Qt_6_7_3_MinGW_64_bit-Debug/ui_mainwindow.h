/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 6.7.3
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QApplication>
#include <QtWidgets/QCalendarWidget>
#include <QtWidgets/QComboBox>
#include <QtWidgets/QGroupBox>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QTabWidget>
#include <QtWidgets/QTableWidget>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QWidget *centralwidget;
    QVBoxLayout *centralLayout;
    QVBoxLayout *headerLayout;
    QLabel *headerLabel;
    QLabel *subtitleLabel;
    QTabWidget *mainTabWidget;
    QWidget *tabSessions;
    QVBoxLayout *sessionsLayout;
    QGroupBox *sessionsCard;
    QVBoxLayout *sessionsCardLayout;
    QHBoxLayout *topControlsLayout;
    QPushButton *addButton;
    QPushButton *modifyButton;
    QPushButton *deleteButton;
    QPushButton *exportButton;
    QLineEdit *searchEdit;
    QComboBox *sortCombo;
    QTableWidget *sessionTable;
    QWidget *tabStats;
    QVBoxLayout *statsLayout;
    QGroupBox *statsCard;
    QVBoxLayout *statsCardLayout;
    QLabel *statsLabel;
    QWidget *tabCalendar;
    QVBoxLayout *calendarLayout;
    QGroupBox *calendarCard;
    QVBoxLayout *calendarCardLayout;
    QCalendarWidget *calendarWidget;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName("MainWindow");
        MainWindow->resize(900, 600);
        MainWindow->setMinimumSize(QSize(650, 320));
        centralwidget = new QWidget(MainWindow);
        centralwidget->setObjectName("centralwidget");
        centralLayout = new QVBoxLayout(centralwidget);
        centralLayout->setObjectName("centralLayout");
        headerLayout = new QVBoxLayout();
        headerLayout->setObjectName("headerLayout");
        headerLabel = new QLabel(centralwidget);
        headerLabel->setObjectName("headerLabel");
        headerLabel->setAlignment(Qt::AlignmentFlag::AlignCenter);

        headerLayout->addWidget(headerLabel);

        subtitleLabel = new QLabel(centralwidget);
        subtitleLabel->setObjectName("subtitleLabel");
        subtitleLabel->setAlignment(Qt::AlignmentFlag::AlignCenter);

        headerLayout->addWidget(subtitleLabel);


        centralLayout->addLayout(headerLayout);

        mainTabWidget = new QTabWidget(centralwidget);
        mainTabWidget->setObjectName("mainTabWidget");
        QSizePolicy sizePolicy(QSizePolicy::Policy::Expanding, QSizePolicy::Policy::Expanding);
        sizePolicy.setHorizontalStretch(0);
        sizePolicy.setVerticalStretch(0);
        sizePolicy.setHeightForWidth(mainTabWidget->sizePolicy().hasHeightForWidth());
        mainTabWidget->setSizePolicy(sizePolicy);
        mainTabWidget->setTabPosition(QTabWidget::TabPosition::North);
        tabSessions = new QWidget();
        tabSessions->setObjectName("tabSessions");
        sessionsLayout = new QVBoxLayout(tabSessions);
        sessionsLayout->setObjectName("sessionsLayout");
        sessionsCard = new QGroupBox(tabSessions);
        sessionsCard->setObjectName("sessionsCard");
        sessionsCardLayout = new QVBoxLayout(sessionsCard);
        sessionsCardLayout->setObjectName("sessionsCardLayout");
        topControlsLayout = new QHBoxLayout();
        topControlsLayout->setObjectName("topControlsLayout");
        addButton = new QPushButton(sessionsCard);
        addButton->setObjectName("addButton");

        topControlsLayout->addWidget(addButton);

        modifyButton = new QPushButton(sessionsCard);
        modifyButton->setObjectName("modifyButton");

        topControlsLayout->addWidget(modifyButton);

        deleteButton = new QPushButton(sessionsCard);
        deleteButton->setObjectName("deleteButton");

        topControlsLayout->addWidget(deleteButton);

        exportButton = new QPushButton(sessionsCard);
        exportButton->setObjectName("exportButton");

        topControlsLayout->addWidget(exportButton);

        searchEdit = new QLineEdit(sessionsCard);
        searchEdit->setObjectName("searchEdit");

        topControlsLayout->addWidget(searchEdit);

        sortCombo = new QComboBox(sessionsCard);
        sortCombo->addItem(QString());
        sortCombo->addItem(QString());
        sortCombo->addItem(QString());
        sortCombo->addItem(QString());
        sortCombo->setObjectName("sortCombo");
        sortCombo->setEditable(false);

        topControlsLayout->addWidget(sortCombo);


        sessionsCardLayout->addLayout(topControlsLayout);

        sessionTable = new QTableWidget(sessionsCard);
        if (sessionTable->columnCount() < 7)
            sessionTable->setColumnCount(7);
        QTableWidgetItem *__qtablewidgetitem = new QTableWidgetItem();
        sessionTable->setHorizontalHeaderItem(0, __qtablewidgetitem);
        QTableWidgetItem *__qtablewidgetitem1 = new QTableWidgetItem();
        sessionTable->setHorizontalHeaderItem(1, __qtablewidgetitem1);
        QTableWidgetItem *__qtablewidgetitem2 = new QTableWidgetItem();
        sessionTable->setHorizontalHeaderItem(2, __qtablewidgetitem2);
        QTableWidgetItem *__qtablewidgetitem3 = new QTableWidgetItem();
        sessionTable->setHorizontalHeaderItem(3, __qtablewidgetitem3);
        QTableWidgetItem *__qtablewidgetitem4 = new QTableWidgetItem();
        sessionTable->setHorizontalHeaderItem(4, __qtablewidgetitem4);
        QTableWidgetItem *__qtablewidgetitem5 = new QTableWidgetItem();
        sessionTable->setHorizontalHeaderItem(5, __qtablewidgetitem5);
        QTableWidgetItem *__qtablewidgetitem6 = new QTableWidgetItem();
        sessionTable->setHorizontalHeaderItem(6, __qtablewidgetitem6);
        sessionTable->setObjectName("sessionTable");
        sizePolicy.setHeightForWidth(sessionTable->sizePolicy().hasHeightForWidth());
        sessionTable->setSizePolicy(sizePolicy);
        sessionTable->setMinimumSize(QSize(600, 200));

        sessionsCardLayout->addWidget(sessionTable);


        sessionsLayout->addWidget(sessionsCard);

        mainTabWidget->addTab(tabSessions, QString());
        tabStats = new QWidget();
        tabStats->setObjectName("tabStats");
        statsLayout = new QVBoxLayout(tabStats);
        statsLayout->setObjectName("statsLayout");
        statsCard = new QGroupBox(tabStats);
        statsCard->setObjectName("statsCard");
        statsCardLayout = new QVBoxLayout(statsCard);
        statsCardLayout->setObjectName("statsCardLayout");
        statsLabel = new QLabel(statsCard);
        statsLabel->setObjectName("statsLabel");
        statsLabel->setAlignment(Qt::AlignmentFlag::AlignCenter);

        statsCardLayout->addWidget(statsLabel);


        statsLayout->addWidget(statsCard);

        mainTabWidget->addTab(tabStats, QString());
        tabCalendar = new QWidget();
        tabCalendar->setObjectName("tabCalendar");
        calendarLayout = new QVBoxLayout(tabCalendar);
        calendarLayout->setObjectName("calendarLayout");
        calendarCard = new QGroupBox(tabCalendar);
        calendarCard->setObjectName("calendarCard");
        calendarCardLayout = new QVBoxLayout(calendarCard);
        calendarCardLayout->setObjectName("calendarCardLayout");
        calendarWidget = new QCalendarWidget(calendarCard);
        calendarWidget->setObjectName("calendarWidget");

        calendarCardLayout->addWidget(calendarWidget);


        calendarLayout->addWidget(calendarCard);

        mainTabWidget->addTab(tabCalendar, QString());

        centralLayout->addWidget(mainTabWidget);

        MainWindow->setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar->setObjectName("menubar");
        menubar->setGeometry(QRect(0, 0, 900, 25));
        MainWindow->setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar->setObjectName("statusbar");
        MainWindow->setStatusBar(statusbar);

        retranslateUi(MainWindow);

        mainTabWidget->setCurrentIndex(0);


        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QCoreApplication::translate("MainWindow", "MainWindow", nullptr));
        headerLabel->setStyleSheet(QCoreApplication::translate("MainWindow", "font-size: 32px; font-weight: bold; color: #2d3a4a; margin-bottom: 0px;", nullptr));
        headerLabel->setText(QCoreApplication::translate("MainWindow", "Smart Driving School", nullptr));
        subtitleLabel->setStyleSheet(QCoreApplication::translate("MainWindow", "font-size: 16px; color: #4a5a6a; margin-bottom: 12px;", nullptr));
        subtitleLabel->setText(QCoreApplication::translate("MainWindow", "Gestion avanc\303\251e des s\303\251ances, statistiques et calendrier", nullptr));
        sessionsCard->setTitle(QCoreApplication::translate("MainWindow", "Gestion des s\303\251ances", nullptr));
        addButton->setText(QCoreApplication::translate("MainWindow", "Ajouter", nullptr));
        modifyButton->setText(QCoreApplication::translate("MainWindow", "Modifier", nullptr));
        deleteButton->setText(QCoreApplication::translate("MainWindow", "Supprimer", nullptr));
        exportButton->setText(QCoreApplication::translate("MainWindow", "Exporter", nullptr));
        searchEdit->setPlaceholderText(QCoreApplication::translate("MainWindow", "Recherche...", nullptr));
        sortCombo->setItemText(0, QCoreApplication::translate("MainWindow", "Trier par", nullptr));
        sortCombo->setItemText(1, QCoreApplication::translate("MainWindow", "Date", nullptr));
        sortCombo->setItemText(2, QCoreApplication::translate("MainWindow", "\303\211l\303\250ve", nullptr));
        sortCombo->setItemText(3, QCoreApplication::translate("MainWindow", "Moniteur", nullptr));

        QTableWidgetItem *___qtablewidgetitem = sessionTable->horizontalHeaderItem(0);
        ___qtablewidgetitem->setText(QCoreApplication::translate("MainWindow", "id de session", nullptr));
        QTableWidgetItem *___qtablewidgetitem1 = sessionTable->horizontalHeaderItem(1);
        ___qtablewidgetitem1->setText(QCoreApplication::translate("MainWindow", "eleve", nullptr));
        QTableWidgetItem *___qtablewidgetitem2 = sessionTable->horizontalHeaderItem(2);
        ___qtablewidgetitem2->setText(QCoreApplication::translate("MainWindow", "moniteur", nullptr));
        QTableWidgetItem *___qtablewidgetitem3 = sessionTable->horizontalHeaderItem(3);
        ___qtablewidgetitem3->setText(QCoreApplication::translate("MainWindow", "type ", nullptr));
        QTableWidgetItem *___qtablewidgetitem4 = sessionTable->horizontalHeaderItem(4);
        ___qtablewidgetitem4->setText(QCoreApplication::translate("MainWindow", "date", nullptr));
        QTableWidgetItem *___qtablewidgetitem5 = sessionTable->horizontalHeaderItem(5);
        ___qtablewidgetitem5->setText(QCoreApplication::translate("MainWindow", "poste", nullptr));
        QTableWidgetItem *___qtablewidgetitem6 = sessionTable->horizontalHeaderItem(6);
        ___qtablewidgetitem6->setText(QCoreApplication::translate("MainWindow", "vehicule", nullptr));
        mainTabWidget->setTabText(mainTabWidget->indexOf(tabSessions), QCoreApplication::translate("MainWindow", "S\303\251ances", nullptr));
        statsCard->setTitle(QCoreApplication::translate("MainWindow", "Statistiques avanc\303\251es", nullptr));
        statsLabel->setText(QCoreApplication::translate("MainWindow", "Graphiques et r\303\251capitulatifs ici...", nullptr));
        mainTabWidget->setTabText(mainTabWidget->indexOf(tabStats), QCoreApplication::translate("MainWindow", "Statistiques", nullptr));
        calendarCard->setTitle(QCoreApplication::translate("MainWindow", "Calendrier des s\303\251ances", nullptr));
        mainTabWidget->setTabText(mainTabWidget->indexOf(tabCalendar), QCoreApplication::translate("MainWindow", "Calendrier", nullptr));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
