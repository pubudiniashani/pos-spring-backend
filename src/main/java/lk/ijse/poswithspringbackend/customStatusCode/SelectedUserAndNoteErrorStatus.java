package lk.ijse.poswithspringbackend.customStatusCode;


import lk.ijse.poswithspringbackend.dto.CustomerStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserAndNoteErrorStatus implements CustomerStatus{
    private int statusCode;
    private String statusMessage;
}
