package lk.ijse.poswithspringbackend.service;



import lk.ijse.poswithspringbackend.dto.ItemStatus;
import lk.ijse.poswithspringbackend.dto.impl.ItemDTO;

import java.util.List;

public interface ItemService {
    void saveItem(ItemDTO itemDTO);
    List<ItemDTO> getAllItems();
    ItemStatus getItem(String itemId);
    void deleteItem(String itemId);
    void updateItem(String itemId , ItemDTO itemDTO);
}
