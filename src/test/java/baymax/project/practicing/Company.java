package baymax.project.practicing;

import lombok.Data;

@Data
public class Company {
    private String companyName, country, service;
    private int yearOfBuild;

    public static void main(String[] args) {
        Company company = new Company();
        company.setCompanyName("Sun SCD Limited");
        company.setCountry("Vietnam");
        company.setYearOfBuild(2000);
        company.setService("Transportation");
        System.out.println("Company name: " + company.getCompanyName());
        System.out.println("Country: " + company.getCountry());
        System.out.println("Year of build: " + company.getYearOfBuild());
        System.out.println("Service: " + company.getService());
        System.out.println(company);

    }
}
