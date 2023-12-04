package RA.business.daoimpl;

import RA.business.dao.ICatalogDao;
import RA.business.entity.Catalog;
import RA.util.IOFile;
import RA.util.InputMethods;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CatalogDaoImpl implements ICatalogDao {
    public static List<Catalog> catalogs;

    public CatalogDaoImpl() {
        catalogs = IOFile.getListFromFile(IOFile.CATALOG_PATH);
    }

    @Override
    public List<Catalog> findAll() { // tra ve tat ca cac doi tuong danh muc
        if(!catalogs.isEmpty()){
            return catalogs;
        }
        return null;
    }

    @Override
    public Catalog findbyId(Long id) { // tim kiem danh muc theo ma danh muc
        for (Catalog c: catalogs
             ) {
            if(Objects.equals(c.getCatalogId(), id)){
                return c;
            }
        }
        return null;
    }

    @Override
    public void add(Catalog catalog) {
        catalogs.add(catalog);
        IOFile.writeToFile(IOFile.CATALOG_PATH, catalogs);
    }

    @Override
    public void update(Catalog catalog) {
        catalogs.set(catalogs.indexOf(findbyId(catalog.getCatalogId())), catalog);
        IOFile.writeToFile(IOFile.CATALOG_PATH, catalogs);
    }

    @Override
    public List<Catalog> findByName(String catalogName) {
        return catalogs.stream().filter(c->c.getCatalogName().toLowerCase().contains(catalogName.toLowerCase())).collect(Collectors.toList());
    }

    @Override
    public void showNameAndId() {
        Map<String, Long> map = new TreeMap<>();
        for (int i = 0; i < catalogs.size(); i++) {
            map.put(catalogs.get(i).getCatalogName(), catalogs.get(i).getCatalogId());
        }
        for (Map.Entry<String, Long> en : map.entrySet()) {
            System.out.println(en.getKey() + "/" + en.getValue());
        }
    }

    @Override
    public Long[] validateIds() {
        Long[] idsNumber;
        boolean check;
        do {
            System.out.println("Hãy nhập ID những danh mục cần ẩn (cách nhau bởi dấu phẩy) : ");
            String ids = InputMethods.getString();
            check = true;
            String[] idsString = ids.split(",");
            idsNumber = new Long[idsString.length];
            for(int i = 0 ; i < idsString.length;i++){
                try{
                    // Ép kiểu
                    idsNumber[i] = Long.parseLong(idsString[i]);
                }catch (NumberFormatException e){
                    // Nếu có lỗi khi ép kiểu -> bắt lỗi
                    System.err.println("ID phải là số!");
                    check = false;
                    break;
                }
            }
            if(check) {
                for (int i = 0; i < idsNumber.length; i++) {
                    if (idsNumber[i] <= 0) {
                        System.err.println("ID phải là số nguyên dương !");;
                        check = false;
                        break;
                    } else if (findbyId(idsNumber[i]) == null) {
                        System.err.println("ID : " + idsNumber[i] + " không tồn tại!");
                        check = false;
                        break;
                    }
                }
            }

        }while(!check);
        return idsNumber;
    }

}

