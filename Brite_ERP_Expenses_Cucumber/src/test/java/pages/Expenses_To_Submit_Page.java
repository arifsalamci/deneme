package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Config;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Expenses_To_Submit_Page {

    public Expenses_To_Submit_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[.='My Expenses to Submit']")
    public WebElement textDisplay;

    @FindBy(xpath = "//li[.='New']")
    public WebElement newTextDisplay;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement expenseDescriptionInput;

    @FindBy(xpath = "//label[.='Expense Description']")
    public WebElement expenseDescpriptionPage;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement productInput;


    @FindBy(xpath = "(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[1]/li[1]")
     public List<WebElement> list;

    public static WebElement productDropdown(int indexOfProduct){
        List<WebElement> element = Driver.getDriver().findElements(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[1]/li"));
        return element.get(indexOfProduct);
//   String path = "src/ExpenseData.xlsx";
//   String sheetName = "ExpenseTestData";
//
//   FileInputStream fileInputStream = new FileInputStream(path);
//   XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//   XSSFSheet sheet = workbook.getSheet(sheetName);
//   XSSFCell cell = sheet.getRow(row).getCell(givenCell);

//        for (WebElement product : element) {
//       if (sheet.getRow(1).getCell(2).toString().equals(product.getText())){

//        }
    }

    @FindBy(xpath = "//a[.='[CARD] Apple80']")
    public WebElement chosenProduct;

    @FindBy(xpath = "//input[@id='o_field_input_65']")
    public WebElement unitPriceInput;

    @FindBy(xpath = "//input[@id='o_field_input_70']")
    public WebElement expenseDate;

    @FindBy(xpath = "//div[@name='employee_id']/div")
    public WebElement employeeField;

//    @FindBy(xpath = "//a[.='David Samson'][1]")

    public static WebElement employeeDropdown(int indexOfEmployee){
        List<WebElement> employee = Driver.getDriver().findElements(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'])[4]/li"));
        return employee.get(indexOfEmployee);
    }
    @FindBy(xpath = "//a[.='David Samson'][1]")
    public WebElement employeeName;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[.='Submit to Manager']")
    public WebElement submitToManagerButton;

    @FindBy(xpath = "//button[.='Approve']")
    public WebElement approveButton;

    @FindBy(xpath = "//button[.='Refuse']")
    public WebElement refuseButton;

    @FindBy(xpath = "//li[.='lunch with team']")
    public WebElement textAfterSave;

    @FindBy (xpath = "(//div[@class='o_thread_message_content']/p)[1]")
    public WebElement submittedMessage;

    @FindBy(xpath = "//p[.='Expense created']")
    public WebElement expenseCreatedText;

    @FindBy(xpath = "//li[.='[253] Tshirt'][1]")
    public WebElement productTshirt;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
    public WebElement newproductcreate;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[2]")
    public WebElement okButton;

    @FindBy(xpath = "(//h4[@class='modal-title'])[1]")
    public WebElement errormessage;

    @FindBy(xpath = "(//table[@class='o_group o_inner_group o_group_col_6'][1])")
    public WebElement table;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_form_button_cancel']")
    public WebElement discardButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement cancelButton;



}
